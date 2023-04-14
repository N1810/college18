package com.College.Dao;

import java.util.List;

import com.College.Entity.College;

public interface CollegeDo {
	public College getcoll(String id);

	public College addoneclg(College clg);

	public String deleteoneclg(String clg_id);

	public String updateoneclg(College clg);

	public List<College> getallclg();
}
