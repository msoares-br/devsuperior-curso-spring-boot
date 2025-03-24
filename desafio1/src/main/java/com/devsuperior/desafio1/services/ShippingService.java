package com.devsuperior.desafio1.services;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {

	public double shipment(double basic) {
		if (basic < 100) {
			return 20.0;
		} else if (basic < 200) {
			return 12.0;
		}
				else {
					return 0;
			}
	}
}

