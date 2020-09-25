package com.costa.challengeMatriz.controller;




import com.costa.challengeMatriz.returns.ReturnsMatriz;
import com.costa.challengeMatriz.service.AMethods;
import org.springframework.web.bind.annotation.*;





@RestController
public class MatrizController {

    public AMethods metodos = new AMethods();

    @GetMapping ("ping")
    public String ping(){
        return "pong";
    }
   /* @PostMapping(value = "/matriz" , consumes = "application/json")
    public List<Matriz> matriz(@RequestBody List<Matriz> list){
       prueba = new ArrayList<>();
        prueba.addAll(list);
        return prueba;
    }*/
    @PostMapping(value = "lista", consumes = "application/json")
    public ReturnsMatriz lista (@RequestBody int[][] matriz){
        ReturnsMatriz retorno = new ReturnsMatriz();
        retorno.setValorMaximo(metodos.max(matriz));
        retorno.setValorMinimo(metodos.min(matriz));
        retorno.setOrden(metodos.ordenar(matriz));
        return retorno;
    }


}
