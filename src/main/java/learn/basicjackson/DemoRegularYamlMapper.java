package learn.basicjackson;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

public class DemoRegularYamlMapper {
	public static void main (String[] args) throws StreamReadException, DatabindException, IOException {
		ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
		
		Employee employee = mapper.readValue(new File("src/main/resources/test.yaml"), Employee.class);
		System.out.println("name: " + employee.getName());
		System.out.println("job:" + employee.getJob());
		System.out.println("skill:" + employee.getSkill());
		System.out.println("isEmployed: " + employee.isEmployed());
		System.out.println("education: " + employee.getEducation());
		
		Languages languages = employee.getLanguages();
		System.out.println("perl: " + languages.getPerl());
		System.out.println("python: " + languages.getPython());
		System.out.println("java: " + languages.getJava());
		System.out.println("pascal: " + languages.getPascal());
	}
}
