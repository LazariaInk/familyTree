package md.lazaria.familyTree.repository;

import md.lazaria.familyTree.model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BranchRepository extends JpaRepository<Branch,Integer> {
}
