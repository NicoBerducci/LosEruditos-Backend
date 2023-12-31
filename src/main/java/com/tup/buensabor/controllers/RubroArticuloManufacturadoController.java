package com.tup.buensabor.controllers;

import com.tup.buensabor.entities.RubroArticuloManufacturado;
import com.tup.buensabor.services.RubroArticuloManufacturadoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/RubroArticuloManufacturado")

public class RubroArticuloManufacturadoController extends BaseControllerImpl<RubroArticuloManufacturado, RubroArticuloManufacturadoServiceImpl> {
}
