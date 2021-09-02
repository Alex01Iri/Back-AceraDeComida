package org.generation.demodb.seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(path="api/aceradecomida_seller/")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
public class sellerController {
    private final SellerService sellerService;
    @Autowired
    public sellerController(SellerService sellerService) {
        this.sellerService = sellerService;
    }//constructor
    @GetMapping
    public List<seller> getSeller() {
        return sellerService.getSeller();
    }//getSeller
    @GetMapping(path="{sellerId}")
    public seller getSeller(@PathVariable("sellerId") Long sellerId) {
        return sellerService.getSeller(sellerId);
    }//getSeller
    @DeleteMapping(path="{sellerId}")
    public void deleteSeller(@PathVariable("sellerId") Long sellerId) {
        sellerService.deleteSeller(sellerId);
    }//deleteSeller
    @PostMapping
    public void addSeller(@RequestBody seller slr){
        sellerService.addSeller(slr);
    }// addSeller
    @PutMapping(path="{sellerId}")
    public void updateSeller (@PathVariable("sellerId") Long sellerId,
                            @RequestParam String oldPassword,
                            @RequestParam String password) {
        sellerService.updateSeller(sellerId, oldPassword, password);
    }//updateSeller
}