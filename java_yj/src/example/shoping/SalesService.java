package example.shoping;

import java.util.List;
import java.util.function.Predicate;

public interface SalesService {

	Sales inputSales(String string);

	void printByYear();

	void printByYear(List<Sales> salesList);

	void printSales(List<Sales> salesList,Predicate<Sales> p);

	void printByMonth(List<Sales> salesList);

	void printByday(List<Sales> salesList);
}
