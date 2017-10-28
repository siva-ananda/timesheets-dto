package be.steformations.sivananda.data.timesheets.dto;

import java.io.ByteArrayOutputStream;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class TimesheetsDtoFactory {

	private JAXBContext jaxbContext;

	public TimesheetsDtoFactory() {
		super();
		try {
			this.jaxbContext = JAXBContext.newInstance(ProjectDto.class, PrestationDto.class, EmployeeDto.class);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public String projectToXml(ProjectDto project) {
		return this.objectToXml(project);
	}

	public ProjectDto xmlToProject(String xml) {
		return (ProjectDto) this.xmlToObject(xml);
	}

	public String prestationToXml(PrestationDto prestation) {
		return this.objectToXml(prestation);
	}

	public PrestationDto xmlToPrestation(String xml) {
		return (PrestationDto) this.xmlToObject(xml);
	}

	public String employeeToXml(EmployeeDto employee) {
		return this.objectToXml(employee);
	}

	public EmployeeDto xmlToEmployee(String xml) {
		return (EmployeeDto) this.xmlToObject(xml);
	}

	private String objectToXml(Object object) {
		String xml = null;
		try (ByteArrayOutputStream output = new ByteArrayOutputStream();) {
			Marshaller marshaller = this.jaxbContext.createMarshaller();
			marshaller.marshal(object, output);
			xml = output.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return xml;
	}

	private Object xmlToObject(String xml) {
		Object object = null;
		try (StringReader input = new StringReader(xml);) {
			Unmarshaller unmarshaller = this.jaxbContext.createUnmarshaller();
			object = unmarshaller.unmarshal(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return object;
	}

}
