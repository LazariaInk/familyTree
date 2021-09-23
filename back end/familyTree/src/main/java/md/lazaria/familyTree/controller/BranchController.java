package md.lazaria.familyTree.controller;

import md.lazaria.familyTree.model.Branch;
import md.lazaria.familyTree.service.BranchService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/branches")
public class BranchController {
    private final BranchService branchService;

    public BranchController(BranchService branchService) {
        this.branchService = branchService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Branch>> getAllBranches () {
        List<Branch> branches = branchService.findAllBranches();
        return new ResponseEntity<>(branches, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Branch> getBranchById (@PathVariable("id") Integer id) {
        Branch branch = branchService.findBrancheById(id);
        return new ResponseEntity<>(branch, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Branch> addBranch(@RequestBody Branch branch) {
        Branch newBranch = branchService.addBranch(branch);
        return new ResponseEntity<>(newBranch, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Branch> updateBranch(@RequestBody Branch branch) {
        Branch updateBranche = branchService.updateBranch(branch);
        return new ResponseEntity<>(updateBranche, HttpStatus.OK);
    }

}
