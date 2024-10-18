<%-- 
    Document   : ban-chay-yeu-thich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    <div class="product-widget-area">
        <div class="zigzag-bottom"></div>
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                    <div class="single-product-widget">
                        <h2 class="product-wid-title">Bán chạy nhất</h2>
                        <a href="" class="wid-view-more">Danh sách</a>
                        
                        <c:forEach items="${dsspbc }" var="sp">
	                        <div class="single-wid-product">
	                            <a href="single-product.html"><img src="img/${sp.hinhAnh }" alt="" class="product-thumb"></a>
	                            <h2><a href="single-product.html">${sp.tenSanPham }</a></h2>
	                            <div class="product-wid-rating">
	                                <i class="fa fa-star"></i>
	                                <i class="fa fa-star"></i>
	                                <i class="fa fa-star"></i>
	                                <i class="fa fa-star"></i>
	                                <i class="fa fa-star"></i>
	                            </div>
	                            <div class="product-wid-price">
	                            	<fmt:setLocale value="vi-VN"/>
	                            	<fmt:formatNumber value="${sp.donGiaKM }" var="num1"></fmt:formatNumber>
	                                <ins>${num1 } vnđ</ins> 
	                                
	                                <fmt:formatNumber value="${sp.donGia }" var="num2"></fmt:formatNumber>
	                                <del>$${num2 } vnđ</del>
	                            </div>                            
	                        </div>
                        </c:forEach>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="single-product-widget">
                        <h2 class="product-wid-title">Giảm nhiều nhất</h2>
                        <a href="#" class="wid-view-more">Danh sách</a>
                        <c:forEach items="${dsspgiam }" var="sp">
	                        <div class="single-wid-product">
	                            <a href="single-product.html"><img src="img/${sp.hinhAnh }" alt="" class="product-thumb"></a>
	                            <h2><a href="single-product.html">${sp.tenSanPham }</a></h2>
	                            <div class="product-wid-rating">
	                                <i class="fa fa-star"></i>
	                                <i class="fa fa-star"></i>
	                                <i class="fa fa-star"></i>
	                                <i class="fa fa-star"></i>
	                                <i class="fa fa-star"></i>
	                            </div>
	                            <div class="product-wid-price">
	                            <fmt:formatNumber value="${sp.donGiaKM }" var="num1"></fmt:formatNumber>
	                                <ins>${num1 } vnđ</ins> 
	                                
	                                <fmt:formatNumber value="${sp.donGia }" var="num2"></fmt:formatNumber>
	                                <del>${num2 } vnđ</del>
	                                 
	                            </div>                            
	                        </div>
                        </c:forEach>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="single-product-widget">
                        <h2 class="product-wid-title">Yêu thích nhất</h2>
                        <a href="#" class="wid-view-more">Danh sách</a>
                        <c:forEach items="${dssplove }" var="sp">
	                        <div class="single-wid-product">
	                            <a href="single-product.html"><img src="img/${sp.hinhAnh }" alt="" class="product-thumb"></a>
	                            <h2><a href="single-product.html">${sp.tenSanPham }</a></h2>
	                            <div class="product-wid-rating">
	                                <i class="fa fa-star"></i>
	                                <i class="fa fa-star"></i>
	                                <i class="fa fa-star"></i>
	                                <i class="fa fa-star"></i>
	                                <i class="fa fa-star"></i>
	                            </div>
	                            <div class="product-wid-price">
	                                <fmt:formatNumber value="${sp.donGiaKM }" var="num1"></fmt:formatNumber>
	                                <ins>${num1 } vnđ</ins> 
	                                
	                                <fmt:formatNumber value="${sp.donGia }" var="num2"></fmt:formatNumber>
	                                <del>${num2 } vnđ</del>
	                            </div>                            
	                        </div>
                        </c:forEach>
                    </div>
                </div>
            </div>
        </div>
    </div> <!-- End product widget area -->
