<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<nav class="navbar navbar-expand navbar-dark bg-dark">
        <div class="container">
            <div class="navbar-header">
                <a class="navbar-brand" href="./welcome.jsp">Home</a>
                <a class="navbar-brand" href="./products.jsp">products</a>
                <a class="navbar-brand" href="./addProduct.jsp">addProduct</a>
                <a class="navbar-brand" href="cart.jsp">Cart</a>
            </div>
	         <div>
				<ul class="navbar-nav mr-auto">
					<li class="nav-item"><a class="nav-link" href="./dbProducts.jsp">상품 목록</a></li>
					<li class="nav-item"><a class="nav-link" href="./addProduct.jsp">상품 등록</a></li>
					<li class="nav-item"><a class="nav-link" href="./editProduct.jsp?edit=update">상품 수정</a></li>
					<li class="nav-item"><a class="nav-link" href="./editProduct.jsp?edit=delete">상품 삭제</a></li>
				</ul>
			</div>
        </div>
    </nav>


