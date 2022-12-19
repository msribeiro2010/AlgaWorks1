
public class Pedido {
	
	Integer codigo;
	Double subtotal;
	Double desconto;
	//Double Total;
	
	
	
	Double getTotal() {
		return subtotal - desconto;
	}
	Integer getCodigo() {
		return codigo;
	}
	void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	void setTotal(Double total) {
		
	}
	Double getSubtotal() {
		return subtotal;
	}
	void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	Double getDesconto() {
		return desconto;
	}
	void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

}
