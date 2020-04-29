package br.edu.usj.ads.lpii.calculadora;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class Calculadora {

    @PostMapping(value="/calcula")
    public ModelAndView postCalcula(@RequestParam String numero1,@RequestParam String numero2, @RequestParam String operador) {
        
        ModelAndView modelAndView = new ModelAndView("index");

        System.out.println("Passei por aqui");
        System.out.println(numero1);
        System.out.println(operador);
        System.out.println(numero2);

        Double resultado = 0.0;  
       
        if(operador.equals("+")) {
            resultado= Double.parseDouble(numero1);
        
        }
        else{
            resultado = Double.parseDouble(numero2);
        }
       
        String texto = "o resultado é " +resultado;

        modelAndView.addObject("mensagem", texto);

       return modelAndView;
    }
    
    


}