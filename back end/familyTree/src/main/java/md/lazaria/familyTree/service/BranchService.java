package md.lazaria.familyTree.service;

import md.lazaria.familyTree.model.Branch;
import md.lazaria.familyTree.repository.BranchRepository;
import md.lazaria.familyTree.exception.BranchNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Service
public class BranchService {
    public final BranchRepository branchRepository;
    @Autowired
    public BranchService(BranchRepository branchRepository) {
        this.branchRepository = branchRepository;
    }

    public Branch addBranch(Branch branch) {
        return branchRepository.save(branch);
    }

    public List<Branch> findAllBranches() {
        return branchRepository.findAll();
    }

    public Branch updateEmployee(Branch branch) {
        return branchRepository.save(branch);
    }

    public Branch findBrancheById(int id) {
        return branchRepository.findById(id)
                .orElseThrow(() -> new BranchNotFoundException("Branch by id " + id + " was not found"));
    }

    public void deleteBranch(int id){
        branchRepository.deleteById(id);
    }
}
