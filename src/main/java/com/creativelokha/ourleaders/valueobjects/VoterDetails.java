package com.creativelokha.ourleaders.valueobjects;

import java.util.Date;

/**
 * Created by Guru on 10/11/2017.
 */
public class VoterDetails {
	// final static Logger LOGGER = Logger.getLogger(VoterDetails.class);

	private String voter_id;
	private int part_number;
	private int serial_number;
	private String first_name;
	private String last_name;
	private String relation_first_name;
	private String sex;
	private int age;
	private int house_number;
	private String old_id_number;
	private boolean id_status;
	private int assembly_constituency_id;
	private int polling_section_id;
	private int section_id;
	private Date lastUpdateDate;

	public String getVoter_id() {
		return voter_id;
	}

	public void setVoter_id(String voter_id) {
		this.voter_id = voter_id;
	}

	public int getPart_number() {
		return part_number;
	}

	public void setPart_number(int part_number) {
		this.part_number = part_number;
	}

	public int getSerial_number() {
		return serial_number;
	}

	public void setSerial_number(int serial_number) {
		this.serial_number = serial_number;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getRelation_first_name() {
		return relation_first_name;
	}

	public void setRelation_first_name(String relation_first_name) {
		this.relation_first_name = relation_first_name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHouse_number() {
		return house_number;
	}

	public void setHouse_number(int house_number) {
		this.house_number = house_number;
	}

	public String getOld_id_number() {
		return old_id_number;
	}

	public void setOld_id_number(String old_id_number) {
		this.old_id_number = old_id_number;
	}

	public boolean isId_status() {
		return id_status;
	}

	public void setId_status(boolean id_status) {
		this.id_status = id_status;
	}

	public int getAssembly_constituency_id() {
		return assembly_constituency_id;
	}

	public void setAssembly_constituency_id(int assembly_constituency_id) {
		this.assembly_constituency_id = assembly_constituency_id;
	}

	public int getPolling_section_id() {
		return polling_section_id;
	}

	public void setPolling_section_id(int polling_section_id) {
		this.polling_section_id = polling_section_id;
	}

	public int getSection_id() {
		return section_id;
	}

	public void setSection_id(int section_id) {
		this.section_id = section_id;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

}