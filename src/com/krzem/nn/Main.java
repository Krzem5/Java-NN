package com.krzem.nn;



public class Main{
	public static void main(String[] args){
		int[] h={4};
		NeuralNetwork nn=new NeuralNetwork(2,h,1,0.01);
		// NeuralNetwork nn=NeuralNetwork.fromFile("./data.nn-data");
		double[][][] D={{{0,0},{0}},{{0,1},{1}},{{1,0},{1}},{{1,1},{0}}};
		nn.train_multiple(D,D,200000,0,100,true);
		System.out.println(nn.acc(D));
		nn.toFile("./data2.nn-data");
	}
}
