package com.it.test.controller;

import com.it.test.dto.KeywordResult;
import com.it.test.dto.SuggestionsResult;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class SearchController {

	@GetMapping("/search/searchAutocomplete")
	public Object greeting(@RequestParam(name="query", required=false) String query) {
		List<KeywordResult> list = new ArrayList<>();
		list.add(new KeywordResult("hello"));
		list.add(new KeywordResult("world"));
		list.add(new KeywordResult("forever"));
		return new SuggestionsResult(list);
	}
}