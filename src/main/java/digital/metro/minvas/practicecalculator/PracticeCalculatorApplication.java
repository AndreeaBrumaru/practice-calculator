package digital.metro.minvas.practicecalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PracticeCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeCalculatorApplication.class, args);
	}

	@GetMapping("/calculator")
	public double calculator(@RequestParam double aVar, @RequestParam double bVar, @RequestParam String op)
	{
		switch(op)
		{
			case "+":
				return sum(aVar, bVar);
			case "-":
				return minus(aVar, bVar);
			case "*":
				return multiply(aVar, bVar);
			case "/":
				return divide(aVar, bVar);
		}
		return -999999999;
	}

	@GetMapping("/sum")
	public double sum(@RequestParam double aVar, @RequestParam double bVar)
	{
		return aVar + bVar;
	}

	@GetMapping("/minus")
	public double minus(@RequestParam double aVar, @RequestParam double bVar)
	{
		return aVar - bVar;
	}

	@GetMapping("/multiply")
	public double multiply(@RequestParam double aVar, @RequestParam double bVar)
	{
		return aVar * bVar;
	}

	@GetMapping("/divide")
	public double divide(@RequestParam double aVar, @RequestParam double bVar)
	{
		return aVar / bVar;
	}

}
