package com.algaworks.algalog.algalogapi.api.controller;

import com.algaworks.algalog.algalogapi.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList();
        for (int i=0;i<10;i++) {
            Cliente cliente = new Cliente();
            cliente.setId(Long.parseLong(String.valueOf(i)));
            cliente.setNome("Yann ".concat(String.valueOf(i)));
            cliente.setEmail("yann@gmail.com".concat(String.valueOf(i)));
            cliente.setTelefone(String.valueOf(Math.multiplyFull(i, 10) + 1));
            clientes.add(cliente);
        }
        return clientes;
    }
}
