package learn.optionalfield;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;

public class DemoNestedStaticClass {

	public static void main (String[] args) throws StreamReadException, DatabindException, IOException {
		ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
		// mapper.registerModule(new Jdk8Module()) is need in order to map yaml attributes to the optional 
		// fields in Employee class
		// https://www.baeldung.com/jackson-optional
		mapper.registerModule(new Jdk8Module());
		
		Employee employee = mapper.readValue(new File("src/main/resources/test.yaml"), Employee.class);
		System.out.println("name: " + employee.getName());
		System.out.println("job:" + employee.getJob());
		System.out.println("skill:" + employee.getSkill());
		System.out.println("isEmployed: " + employee.getEmployed());
		System.out.println("education: " + employee.getEducation());
		
		Languages languages = employee.getLanguages().get();
		System.out.println("perl: " + languages.getPerl());
		System.out.println("python: " + languages.getPython());
		System.out.println("java: " + languages.getJava());
		System.out.println("pascal: " + languages.getPascal());
	}
}
