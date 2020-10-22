package bo.juanjoses.shopping.repository;

import bo.juanjoses.shopping.entity.InvoiceItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceItemsRepository extends JpaRepository<InvoiceItem, Long> {
}
