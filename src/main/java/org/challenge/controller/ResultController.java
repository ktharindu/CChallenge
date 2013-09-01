package org.challenge.controller;

import org.challenge.model.Result;
import org.challenge.dto.ResultListDto;
import org.challenge.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/results")
public class ResultController {

	@Autowired
	private ResultService service;

	@RequestMapping
	public String getResultsPage() {
		return "results";
	}

	@RequestMapping(value = "/marks")
	public @ResponseBody
	ResultListDto getResults() {
		ResultListDto resultListDto = new ResultListDto();
		// resultListDto.setResults(service.readAll());
		resultListDto.setResults(service.readBySubject("reading", "", ""));
		return resultListDto;
	}

	@RequestMapping(value = "/marksBySubject", method = RequestMethod.POST)
	public @ResponseBody
	ResultListDto getResults(@RequestParam String subject,
			@RequestParam String orderBy, @RequestParam String sortBy) {
		ResultListDto resultListDto = new ResultListDto();
		resultListDto.setResults(service.readBySubject(subject, sortBy, orderBy));
		return resultListDto;
	}

	@RequestMapping(value = "/get")
	public @ResponseBody
	Result get(@RequestBody Result result) {
		return service.read(result);
	}

}
