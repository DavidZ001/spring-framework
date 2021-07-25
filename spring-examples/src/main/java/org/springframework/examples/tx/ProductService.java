package org.springframework.examples.tx;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public interface ProductService {


	public void traction();
}
