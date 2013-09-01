package org.challenge.service;

import java.util.UUID;

import org.challenge.model.Result;
import org.challenge.model.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
//import com.mongodb.util.JSON;
//import com.mongodb.DBObject;

/**
 * Service for initializing MongoDB with sample data using {@link MongoTemplate}
 */
public class InitMongoService {

	@Autowired
	private MongoTemplate mongoTemplate;

	public void init() {
		// Drop existing collections
		mongoTemplate.dropCollection("school");
		mongoTemplate.dropCollection("result");

		// Create new records
		// Insert Schools
		School school = new School();
		Result result_n = new Result();
		Result result_r = new Result();
		Result result_s = new Result();

		// St. Aaron College
		school.setId(UUID.randomUUID().toString());
		school.setSchoolName("St. Aaron College");

		result_n.setId(UUID.randomUUID().toString());
		result_n.setSchool(school);
		result_n.setSubject("numeracy");
		result_n.setLatestY3(413.55);
		result_n.setLatestY5(494.25);
		result_n.setLatestY7(0.0);
		result_n.setLatestY9(0.0);
		result_n.setRawGainY3Y5(61.4917);
		result_n.setFactoredGainY3Y5(69.81);
		result_n.setGlgY3Y5(113.52757826);
		result_n.setLatestGainInGainY3Y5(-7.0);

		result_r.setId(UUID.randomUUID().toString());
		result_r.setSchool(school);
		result_r.setSubject("reading");
		result_r.setLatestY3(411.66);
		result_r.setLatestY5(532.52);
		result_r.setLatestY7(0.0);
		result_r.setLatestY9(0.0);
		result_r.setRawGainY3Y5(74.84);
		result_r.setFactoredGainY3Y5(62.05);
		result_r.setGlgY3Y5(82.91);
		result_r.setLatestGainInGainY3Y5(17.0);

		result_s.setId(UUID.randomUUID().toString());
		result_s.setSchool(school);
		result_s.setSubject("spelling");
		result_s.setLatestY3(412.48);
		result_s.setLatestY5(515.73);
		result_s.setLatestY7(0.0);
		result_s.setLatestY9(0.0);
		result_s.setRawGainY3Y5(84.38);
		result_s.setFactoredGainY3Y5(72.16);
		result_s.setGlgY3Y5(85.52);
		result_s.setLatestGainInGainY3Y5(31.0);

		// Insert to db
		mongoTemplate.insert(school, "school");
		mongoTemplate.insert(result_n, "result");
		mongoTemplate.insert(result_r, "result");
		mongoTemplate.insert(result_s, "result");

		// St. Victor College
		school.setId(UUID.randomUUID().toString());
		school.setSchoolName("St. Victor College");

		result_r.setId(UUID.randomUUID().toString());
		result_r.setSchool(school);
		result_r.setSubject("reading");
		result_r.setLatestY3(445.13);
		result_r.setLatestY5(509.88);
		result_r.setLatestY7(0.0);
		result_r.setLatestY9(0.0);
		result_r.setRawGainY3Y5(71.31);
		result_r.setFactoredGainY3Y5(61.9);
		result_r.setGlgY3Y5(86.81);
		result_r.setLatestGainInGainY3Y5(-17.0);

		result_s.setId(UUID.randomUUID().toString());
		result_s.setSchool(school);
		result_s.setSubject("spelling");
		result_s.setLatestY3(419.60);
		result_s.setLatestY5(517.95);
		result_s.setLatestY7(0.0);
		result_s.setLatestY9(0.0);
		result_s.setRawGainY3Y5(61.04);
		result_s.setFactoredGainY3Y5(57.99);
		result_s.setGlgY3Y5(95.00);
		result_s.setLatestGainInGainY3Y5(-17.0);

		// Insert to db
		mongoTemplate.insert(school, "school");
		mongoTemplate.insert(result_r, "result");
		mongoTemplate.insert(result_s, "result");

		// St. Alexander College
		school.setId(UUID.randomUUID().toString());
		school.setSchoolName("St. Alexander College");

		result_n.setId(UUID.randomUUID().toString());
		result_n.setSchool(school);
		result_n.setSubject("numeracy");
		result_n.setLatestY3(391.0125);
		result_n.setLatestY5(513.925);
		result_n.setLatestY7(0.0);
		result_n.setLatestY9(0.0);
		result_n.setRawGainY3Y5(87.6917);
		result_n.setFactoredGainY3Y5(77.06);
		result_n.setGlgY3Y5(87.87608097);
		result_n.setLatestGainInGainY3Y5(3.0);

		result_r.setId(UUID.randomUUID().toString());
		result_r.setSchool(school);
		result_r.setSubject("reading");
		result_r.setLatestY3(419.77);
		result_r.setLatestY5(491.18);
		result_r.setLatestY7(0.0);
		result_r.setLatestY9(0.0);
		result_r.setRawGainY3Y5(60.05);
		result_r.setFactoredGainY3Y5(65.81);
		result_r.setGlgY3Y5(109.59);
		result_r.setLatestGainInGainY3Y5(-16.0);

		result_s.setId(UUID.randomUUID().toString());
		result_s.setSchool(school);
		result_s.setSubject("spelling");
		result_s.setLatestY3(421.75);
		result_s.setLatestY5(515.65);
		result_s.setLatestY7(0.0);
		result_s.setLatestY9(0.0);
		result_s.setRawGainY3Y5(96.36);
		result_s.setFactoredGainY3Y5(76.22);
		result_s.setGlgY3Y5(79.1);
		result_s.setLatestGainInGainY3Y5(25.0);

		// Insert to db
		mongoTemplate.insert(school, "school");
		mongoTemplate.insert(result_n, "result");
		mongoTemplate.insert(result_r, "result");
		mongoTemplate.insert(result_s, "result");

		// St. Alyssa College
		school.setId(UUID.randomUUID().toString());
		school.setSchoolName("St. Alyssa College");

		result_n.setId(UUID.randomUUID().toString());
		result_n.setSchool(school);
		result_n.setSubject("numeracy");
		result_n.setLatestY3(389.525);
		result_n.setLatestY5(485.075);
		result_n.setLatestY7(508.525);
		result_n.setLatestY9(595.625);
		result_n.setRawGainY3Y5(94.5607);
		result_n.setFactoredGainY3Y5(86.94);
		result_n.setGlgY3Y5(91.94092986);
		result_n.setLatestGainInGainY3Y5(0.0);

		result_r.setId(UUID.randomUUID().toString());
		result_r.setSchool(school);
		result_r.setSubject("reading");
		result_r.setLatestY3(440.65);
		result_r.setLatestY5(494.65);
		result_r.setLatestY7(542.35);
		result_r.setLatestY9(559.52);
		result_r.setRawGainY3Y5(49.63);
		result_r.setFactoredGainY3Y5(62.47);
		result_r.setGlgY3Y5(125.86);
		result_r.setLatestGainInGainY3Y5(-27.0);

		result_s.setId(UUID.randomUUID().toString());
		result_s.setSchool(school);
		result_s.setSubject("spelling");
		result_s.setLatestY3(431.63);
		result_s.setLatestY5(496.55);
		result_s.setLatestY7(533.0);
		result_s.setLatestY9(559.5);
		result_s.setRawGainY3Y5(65.79);
		result_s.setFactoredGainY3Y5(67.10);
		result_s.setGlgY3Y5(102.0);
		result_s.setLatestGainInGainY3Y5(0.0);

		// Insert to db
		mongoTemplate.insert(school, "school");
		mongoTemplate.insert(result_n, "result");
		mongoTemplate.insert(result_r, "result");
		mongoTemplate.insert(result_s, "result");

		// St. Ana Paloma College
		school.setId(UUID.randomUUID().toString());
		school.setSchoolName("St. Ana Paloma College");

		result_n.setId(UUID.randomUUID().toString());
		result_n.setSchool(school);
		result_n.setSubject("numeracy");
		result_n.setLatestY3(318.775);
		result_n.setLatestY5(423.25);
		result_n.setLatestY7(482.3);
		result_n.setLatestY9(509.725);
		result_n.setRawGainY3Y5(115.55);
		result_n.setFactoredGainY3Y5(111.57);
		result_n.setGlgY3Y5(96.55560363);
		result_n.setLatestGainInGainY3Y5(0.0);

		result_r.setId(UUID.randomUUID().toString());
		result_r.setSchool(school);
		result_r.setSubject("reading");
		result_r.setLatestY3(363.38);
		result_r.setLatestY5(431.55);
		result_r.setLatestY7(496.93);
		result_r.setLatestY9(510.2);
		result_r.setRawGainY3Y5(64.81);
		result_r.setFactoredGainY3Y5(97.54);
		result_r.setGlgY3Y5(150.5);
		result_r.setLatestGainInGainY3Y5(-13.0);

		result_s.setId(UUID.randomUUID().toString());
		result_s.setSchool(school);
		result_s.setSubject("spelling");
		result_s.setLatestY3(365.05);
		result_s.setLatestY5(448.18);
		result_s.setLatestY7(488.25);
		result_s.setLatestY9(511.55);
		result_s.setRawGainY3Y5(75.94);
		result_s.setFactoredGainY3Y5(96.91);
		result_s.setGlgY3Y5(127.62);
		result_s.setLatestGainInGainY3Y5(0.0);

		// Insert to db
		mongoTemplate.insert(school, "school");
		mongoTemplate.insert(result_n, "result");
		mongoTemplate.insert(result_r, "result");
		mongoTemplate.insert(result_s, "result");

	}
}
