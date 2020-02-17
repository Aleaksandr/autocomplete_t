package com.it.test.controller;

import com.it.test.dto.*;
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

	@GetMapping("/search/searchScholarshipPages")
	public Object searchScholarshipPages(@RequestParam(name="query", required=false) String query) {
		ResultSearchDTO result = new ResultSearchDTO();
		MetaPagination meta = new MetaPagination();
		List<ResultItemDTO> items = new ArrayList<>();
		for(int i = 0; i < 15; i++){
			ResultItemDTO item = new ResultItemDTO()
					.setId(i + 10)
					.setContent("Content #" + (i + 1) + " total content")
					.setSummaryContent("Content #" + (i + 1) + " summary content")
					.setRefUrl("/ref/url")
					.setTitle("Title #" + (i + 1));
			items.add(item);
		}

		meta.setPage(2);
		meta.setTotalPage(3);
		meta.setRecords(5);
		meta.setTotalRecords(items.size());

		result.setMata(meta);
		result.setItems(items);
		return result;
	}
}