package com.it.test.dto;

import java.util.List;

public class SuggestionsResult {

    private List<KeywordResult> suggestions;

    public SuggestionsResult(List<KeywordResult> suggestions) {
        this.suggestions = suggestions;
    }

    public List<KeywordResult> getSuggestions() {
        return suggestions;
    }

    public SuggestionsResult setSuggestions(List<KeywordResult> suggestions) {
        this.suggestions = suggestions;
        return this;
    }
}
