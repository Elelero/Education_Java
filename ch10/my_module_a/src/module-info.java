module my_module_a {
	exports pack1; //기입하면 은닉x, 기입안하면 은닉o
//	exports pack2;
	requires transitive my_module_b; //my_module_b 모듈 의존 설정
}

