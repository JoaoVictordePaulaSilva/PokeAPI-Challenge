package me.joaovictor.pokechallenge.exception;

import feign.FeignException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(FeignException.NotFound.class)
	public ModelAndView handleNotFound() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("erro", "Pokemon nao encontrado na base da PokeAPI.");
		return mv;
	}

	@ExceptionHandler(Exception.class)
	public ModelAndView handleGenericError() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("erro", "Ocorreu um erro inesperado no servidor.");
		return mv;
	}
}
