var elements = [];
var dataCache = [];

$(document).ready(function () {

    $('#autocomplete-ajax').autocomplete({
        // minChars: 2,
        deferRequestBy: 100,
        noCache: true,
        serviceUrl: '/search/searchAutocomplete',
        // lookup: countriesArray,
        onSearchStart: function(q){
            $('#term').val(q.query);
        },
        lookupFilter: function(suggestion, originalQuery, queryLowerCase) {
            var re = new RegExp('\\b' + $.Autocomplete.utils.escapeRegExChars(queryLowerCase), 'gi');
            return re.test(suggestion.value);
        },
        onSelect: function(suggestion) {
            $('#term').val(suggestion.value);
            // $('#selction-ajax').html('You selected: ' + suggestion.value);
        },
        onHint: function (hint) {
            $('#autocomplete-ajax-x').val(hint);
        },
        onInvalidateSelection: function() {
            // $('#selction-ajax').html('You selected: none');
        }
    });

    $('#search-start').on('click', function () {
        var term = $('#term').val();
        console.log('SEARCH: ' + term);
        searchScholarships(term);
    });
    $('#search-results').on('click', '.content-items', function(){
        showDetails(this.id);
    });
    searchScholarships('financial aid');
});

function showDetails(itemId) {
    loadingStart();
    $.each(dataCache, function(key, item) {
        if(item.id == itemId){
            $('#preview-item').remove();
            var el =
                '<div id="preview-item" class="content-items">\n' +
                '       <div class="title">\n' +
                '           <b>' + item.title + '</b></a>\n' +
                '       </div>\n' +
                '       <div class="rating">\n' +
                '           <a href="' + item.refUrl + '">Apply On Company Site</a>\n' +
                '       </div>\n' +
                '       <div class="summary">\n' +
                '           <ul>\n' +
                '               <li>' + item.content + '</li>\n' +
                '           </ul>\n' +
                '     </div>\n' +
                '</div>';
            $('#preview-block').html(el);
        }
    });


    loadingStop();
}

function searchScholarships(term) {
    loadingStart();
    $.ajax({
        url: "/search/searchScholarshipPages",
        type: "GET",
        data: {
            term: term
        },
        success: function (data) {
            $('#content-items').remove();
            if(data && data.items && data.items.length > 0){
                elements = [];
                dataCache = data.items;
                $.each(data.items, function(key, item) {
                    var el =
                        '<div id="' + item.id + '" class="content-items">\n' +
                        '       <div class="title">\n' +
                        '           <b>' + item.title + '</b></a>\n' +
                        '       </div>\n' +
                        '       <div class="rating">\n' +
                        '           <a href="' + item.refUrl + '">Apply On Company Site</a>\n' +
                        '       </div>\n' +
                        '       <div class="summary">\n' +
                        '           <ul>\n' +
                        '               <li>' + item.summaryContent + '</li>\n' +
                        '           </ul>\n' +
                        '     </div>\n' +
                        '</div>';
                    elements.push(el);
                    // console.log(item);
                });
            }
            if(elements.length > 0){
                var listItems = '';
                $.each(elements, function(key, item) {
                    listItems += item;
                });
                $('#search-results').html(listItems);
            } else {
                $('#search-results').html('<h4>Nothing found</h4>');
            }
        },
        error: function() {
            $('#content-items').remove();
            $('#search-results').html('<h4>Something went wrong...</h4>');
        },
        complete: function() {
            loadingStop();
        }
    });

}

function loadingStart() {
    $('#loading').show();
}

function loadingStop() {
    setTimeout( function(){
        $('#loading').hide();
    }, 500);
}