package com.example.TALLER.PAGO.NOMINA;

import com.example.TALLER.PAGO.NOMINA.MODELO.Empleado;
import com.example.TALLER.PAGO.NOMINA.MODELO.Sucursal;
import com.example.TALLER.PAGO.NOMINA.MODELO.Área;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.geom.Area;
import java.util.Scanner;

@SpringBootApplication
public class TallerPagoNominaApplication {

	public static void main(String[] args) {
		System.out.println("**********************");
		System.out.println("EMPLEADO");
		System.out.println("**********************");

		Scanner lea = new Scanner(System.in);
		Empleado empleado = new Empleado();

		System.out.println("digite su nombre: ");
		empleado.setNombre(lea.nextLine());

		System.out.println("digite su apellido: ");
		empleado.setApellido(lea.nextLine());

		System.out.println("digite su experiencia laboral: ");
		empleado.setExperienciaLaboral(lea.nextLine());

		System.out.println("digite su nivel de educacion: ");
		empleado.setEducacion(lea.nextLine());

		System.out.println("digite su correo: ");
		empleado.setCorreo(lea.nextLine());

		System.out.println("digite su direccion: ");
		empleado.setDireccion(lea.nextLine());

		System.out.println("digite su sexo: ");
		empleado.setSexo(lea.nextLine());

		System.out.println("digite sus fortalezas: ");
		empleado.setFortalezas(lea.nextLine());

		System.out.println("digite sus habilidades: ");
		empleado.setHabilidades(lea.nextLine());

		System.out.println("digite su banco: ");
		empleado.setBanco(lea.nextLine());

		System.out.println("digite su cuenta de banco: ");
		empleado.setNumeroCuentaBancaria(lea.nextInt());

		System.out.println("digite su edad: ");
		empleado.setEdad(lea.nextInt());



		Empleado empleado1 = new Empleado();
		Empleado empleado2 = new Empleado(78L,"samuel", "mazo", 20, "2 años en programacion", "desarrollador", "bancolombia", 6184684, "mazo@gmail.com", 312384494, "carrera 52-49-95", "maestro en desarrollo", "inteligente, habil con las manos, programar en donde sea", true, "masculino");


		System.out.println(empleado1.getNombre());
		System.out.println(empleado2);

		Sucursal sucursal1= new Sucursal();
		Sucursal sucursal2= new Sucursal(2L, "medellín", "ti,ta,rh", 200, "carrera30-52-10", "20315461", "401", true, true, "sucursal1@gmail.com");

		System.out.println("**********************");
		System.out.println("SUCURSAL");
		System.out.println("**********************");

		Sucursal sucursal = new Sucursal();
		System.out.println("ciudad:");
		sucursal.setUbicacion(lea.nextLine());

		System.out.println("areas de la sucursal:");
		sucursal.setAreas(lea.nextLine());

		System.out.println("digite la direccion de la sucursal:");
		sucursal.setDireccion(lea.nextLine());

		System.out.println("telefono:");
		sucursal.setTelefono(lea.nextLine());

		System.out.println("extencion:");
		sucursal.setExtencion(lea.nextLine());

		System.out.println("transporte:");
		sucursal.setTransporte(lea.nextBoolean());

		System.out.println("parqueadero:");
		sucursal.setParquedero(lea.nextBoolean());

		System.out.println("correo:");
		sucursal.setCorreo(lea.nextLine());

		System.out.println("numero de empleados de la sucursal:");
		sucursal.setEmpleados(lea.nextInt());

		Área area1 = new Área();
		Área area2 = new Área(1L, "talento humano", "juan mesa", "piso 3", "300", "401", "medellin", "soft ware de ultima generacion", "manejo de personal", true);
	}

}
