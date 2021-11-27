package academia.impulsat.tutorial.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Alumno")
public class AlumnoController {

	
	@GetMapping("/Listar")
	@ResponseBody
	public String listarAlumnos() {
		return "Método Listar";
	}
	
	@PostMapping("/Registrar")
	@ResponseBody
	public String registrarAlumno() {
		return "Método Registrar";
	}
	
	@PostMapping("/Actualizar")
	@ResponseBody
	public String actualizarAlumno() {
		return "Método Actualizar";
	}
	
	@PostMapping("/Eliminar")
	@ResponseBody
	public String eliminarAlumno() {
		return "Método Eliminar";
	}
	
}
