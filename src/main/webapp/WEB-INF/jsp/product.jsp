<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

<div class="container">
    <form:form method="post" action="/create-product" modelAttribute="product">
        <form:hidden path="id"/>
        <fieldset class="form-group">
            <form:label path="name">Name</form:label>
            <form:input path="name" type="text" class="form-control" required="required"/>
            <form:errors path="name" cssClass="text-warning"/>
        </fieldset>

        <fieldset class="form-group">
            <form:label path="type">Type</form:label>
            <form:input path="type" type="text" class="form-control" required="required"/>
            <form:errors path="type" cssClass="text-warning"/>
        </fieldset>

        <fieldset class="form-group">
            <form:label path="price">Price</form:label>
            <form:input path="price" type="text" class="form-control" required="required"/>
            <form:errors path="price" cssClass="text-warning"/>
        </fieldset>

        <fieldset class="form-group">
            <form:label path="stoc">Stoc</form:label>
            <form:input path="stoc" type="text" class="form-control" required="required"/>
            <form:errors path="stoc" cssClass="text-warning"/>
        </fieldset>

        <button type="submit" class="btn btn-success">Add</button>
    </form:form>
</div>

<%@ include file="common/footer.jspf" %>