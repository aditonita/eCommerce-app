<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

<div class="container">
    <table class="table table-striped">
        <caption>This is the list of our available products:</caption>
        <thead>
        <tr>
            <th>product name</th>
            <th>product type</th>
            <th>price</th>
            <th>stoc</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${products}" var="product">
            <tr>
                <td>${product.name}</td>
                <td>${product.type}</td>
                <td>${product.price} RON</td>
                <td>${product.stoc}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <div>
        <a class="button" href="/add-product">Add a product</a>
    </div>
</div>
<%@ include file="common/footer.jspf" %>