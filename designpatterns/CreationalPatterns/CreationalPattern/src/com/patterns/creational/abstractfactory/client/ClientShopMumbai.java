package com.patterns.creational.abstractfactory.client;

import com.patterns.creational.abstractfactory.AbstractProducer;
import com.patterns.creational.abstractfactory.FurnitureProducerMumbai;
import com.patterns.creational.abstractfactory.model.Furniture;

public class ClientShopMumbai {
	public static void main(String[] args) {
		AbstractProducer producer = new FurnitureProducerMumbai();
		Furniture chair = producer.orderFurniture("CHAIR");
		System.out.println("Got chair delivered :" + chair);
	}
}
