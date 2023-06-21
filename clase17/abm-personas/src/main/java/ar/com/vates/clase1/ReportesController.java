package ar.com.vates.clase1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/reportes/")
public class ReportesController {


    @Autowired
    private PersonasService servicio;

    @GetMapping("cantidadpersonas")
    public int cantidad() {
        return servicio.cantidad();
    }
    @GetMapping("promedioedades")
    public double promedioEdades() {
        return servicio.promedioEdades();
    }

    @GetMapping("cantidadinicial")
    public Map<String, Long> contarInicial() {
        return servicio.contarPorInicialApellido();
    }




}
