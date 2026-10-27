package calculator.calculator.Controller

import org.springframework.web.bind.annotation.GetMapping
4. import org.springframework.web.bind.annotation.PathVariable
5. import org.springframework.web.bind.annotation.RequestMapping
6. import org.springframework.web.bind.annotation.RestController
7.
8. @RestController
9. @RequestMapping("temperature-converter")
10. class ConverterController {
11. @GetMapping("/celsius-fahrenheit/{celsius}")
12. fun getFahrenheit(@PathVariable celsius: Double) = ((celsius * 9) / 5 + 32)
13.
14. @GetMapping("/fahrenheit-celsius/{fahrenheit}")
15. fun getCelsius(@PathVariable fahrenheit: Double) = ((fahrenheit - 32) * 5) / 9}