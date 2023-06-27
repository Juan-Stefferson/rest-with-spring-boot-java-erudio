package br.com.erudio.restwithspringbootjavaerudio;

import br.com.erudio.restwithspringbootjavaerudio.Utils.Converter;
import br.com.erudio.restwithspringbootjavaerudio.exception.UnsupportedException;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MathController {
	
	Converter converter;
	private static final String ERROR = "Please set a numect value";  // Compliant
	
	@GetMapping(value = "/sum/{number1}/{number2}")
	public Double sum(@PathVariable(value = "number1") String number1, @PathVariable(value = "number2") String number2) {
		if(!converter.isNumeric(number1) || !converter.isNumeric(number2)) {
			throw new UnsupportedException(ERROR);
		}
		return converter.convertToDouble(number1) + converter.convertToDouble(number2);
	}
	
	@GetMapping(value = "/minus/{number1}/{number2}")
	public Double minus(@PathVariable(value = "number1") String number1, @PathVariable(value = "number2") String number2) {
		if(!converter.isNumeric(number1) || !converter.isNumeric(number2)) {
			throw new UnsupportedException(ERROR);
		}
		return converter. convertToDouble(number1) - converter. convertToDouble(number2);
	}
	
	@GetMapping(value = "/mult/{number1}/{number2}")
	public Double mult(@PathVariable(value = "number1") String number1, @PathVariable(value = "number2") String number2) {
		if(!converter.isNumeric(number1) || !converter.isNumeric(number2)) {
			throw new UnsupportedException(ERROR);
		}
		return converter. convertToDouble(number1) * converter. convertToDouble(number2);
	}
	
	@GetMapping(value = "/media/{number1}/{number2}")
	public Double media(@PathVariable(value = "number1") String number1, @PathVariable(value = "number2") String number2){
		if(!converter.isNumeric(number1) || !converter.isNumeric(number2)) {
			throw new UnsupportedException(ERROR);
		}
		return converter. convertToDouble(number1) / converter. convertToDouble(number2);
	}
	
	@GetMapping(value = "/squareRoot/{number1}/{number2}")
	public Double squareRoot(@PathVariable(value = "number1") String number1){
		if(!converter.isNumeric(number1)) {
			throw new UnsupportedException(ERROR);
		}
		return Math.sqrt(converter.convertToDouble(number1)
		);
	}
	
	
}
