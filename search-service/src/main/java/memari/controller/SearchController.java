package memari.controller;

import com.quebic.common.util.ControllerBase;
import memari.model.Product;
import memari.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("search")
public class SearchController extends ControllerBase {

    @Autowired
    private SearchService searchService;

    @GetMapping(value = "{name}")
    public List<Product> add(@PathVariable String name) {
        return searchService.search(name);
    }


}
