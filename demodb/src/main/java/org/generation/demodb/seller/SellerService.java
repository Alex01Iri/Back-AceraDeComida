package org.generation.demodb.seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class SellerService {
    private final SellerRepository sellerRepository;
    @Autowired
    public SellerService(SellerRepository sellerRepository) {
        this.sellerRepository = sellerRepository;
    }//constructor
    public List<seller> getSeller(){
        return sellerRepository.findAll();
    }// getUsers
    public seller getSeller(Long sellerId){
        return sellerRepository.findById(sellerId).orElseThrow(
                () -> new IllegalStateException("User does not exists " + sellerId)
        );
    }// getUser
    public void deleteSeller(Long sellerId) {
        if (sellerRepository.existsById(sellerId)) {
            sellerRepository.deleteById(sellerId);
        } else {
            throw new IllegalStateException("User does not exist " + sellerId);
        }//else
    } // deleteUser
    public void addSeller(seller srl){
        Optional<seller> userByName = sellerRepository.findUserByName(srl.getUsername());
        if (userByName.isPresent()) {
            throw new IllegalStateException("username exist !!!");
        } //if
        sellerRepository.save(srl);
    }//addSeller
    public void updateSeller(Long sellerId, String oldPassword, String newPassword) {
        if (! sellerRepository.existsById(sellerId)) {
            throw new IllegalStateException("User does not exist " + sellerId);
        }//if ! exists
        seller srl = sellerRepository.getById(sellerId);
        if (! srl.getPassword().equals(oldPassword)) {
            throw new IllegalStateException("Password does not match " + sellerId);
        }//if ! exists
        if (newPassword!=null && newPassword.length()>=4 &&
                (! srl.getPassword().equals(newPassword)) &&
                (srl.getPassword().equals(oldPassword)) ) {
            srl.setPassword(newPassword);
            sellerRepository.save(srl);
        }//if
    }// updateUser
}