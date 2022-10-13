package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Controllers;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.EncabPedido;
import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Service.IEncabPedidoService;

@Controller
public class EncabPedidoController {

    @Autowired
    private IEncabPedidoService encabPedidoService;

    @GetMapping("/listarPedidos")
    public String listarPedidos(Model model) {

        model.addAttribute("titulo", "Listado de pedidos");
        model.addAttribute("encabPedidos", encabPedidoService.findAll());

        return "listarPedidos";
    }

    @GetMapping("/formPedidos")
    public String crearPedidos(Map<String, Object> model) {

        EncabPedido encabPedido = new EncabPedido();

        model.put("encabPedido", encabPedido);
        model.put("titulo", "Crear pedido");

        return "formPedidos";
    }

    // @PostMapping("/formPedidos")
    @RequestMapping(value = "/formPedidos", method = RequestMethod.POST)
    public String guardarPedidos(@Valid EncabPedido encabPedido, BindingResult result, Model model) {

        if (result.hasErrors()) {
            model.addAttribute("titulo", "Formulario de pedidos"); // Sí esto resulta en error, que me muestre el titulo
                                                                   // de las cosas y luego guarde.
        }

        encabPedidoService.save(encabPedido);
        return "redirect:listarPedidos";
    }

    @GetMapping("/formPedidos/{idPedido}")
    public String editarPedidos(@PathVariable Long idPedido, Map<String, Object> model) {

        EncabPedido encabPedido = null;

        if (idPedido > 0) {
            encabPedido = encabPedidoService.findOne(idPedido);
        } else {
            return "redirect:listarPedidos";
        }

        model.put("encabPedido", encabPedido);
        model.put("titulo", "Editar pedido");

        return "formPedidos";
    }

    @GetMapping("/eliminarPedidos/{idPedido}")
    public String eliminPedidos(@PathVariable Long idPedido) {

        if (idPedido > 0)
            encabPedidoService.delete(idPedido);

        return "redirect:/listarPedidos";
    }

    @GetMapping("/detallPedido")
    public String detallPedidos(Model model) {

        model.addAttribute("subTitulo", "Detalles pedidos");
        model.addAttribute("listaDetall", encabPedidoService.findAll());

        return "redirect:/formPedidos";
    }

}
