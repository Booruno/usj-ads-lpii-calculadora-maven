package br.edu.usj.ads.lpii.calculadora;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Calculadora {

    @PostMapping(value="/calcula")
    public ModelAndView postCalcula(@RequestParam String numero1,@RequestParam String numero2, @RequestParam String operacao) {
        
        ModelAndView modelAndView = new ModelAndView("index");

        System.out.println("Passei por aqui");
        System.out.println(numero1);
        System.out.println(operacao);
        System.out.println(numero2);

        Double n1 = Double.parseDouble(numero1);
        Double n2 = Double.parseDouble(numero2);
        Double resultado = 0.0;
        
        switch (operacao){
            
            case "1": resultado = n1 + n2; break;
            case "2": resultado = n1 - n2; break;
            case "3": resultado = n1 * n2; break;
            case "4": resultado = n1 / n2; break;
            case "5": resultado = n1 / (n2 * 100); break;
            default: resultado = 0.00;
        }

        String texto = "o resultado é " +resultado;

        modelAndView.addObject("mensagem", texto);

       return modelAndView;
    }
    
    


}