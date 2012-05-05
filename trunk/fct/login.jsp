<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ include file="includes/header.jsp" %>    
<!-- Dashboard icons -->
		<div class="container_12">
            <!-- Password -->
            <div class="grid_6">
                <div class="module">
                     <h2><span>Password</span></h2>
                        
                     <div class="module-body">
                        <form action="">
                            <p>
                                <label>Type in new password</label>
                                <input class="input-medium password" type="password" />
                            </p>
                            <p>
                                <label>Repeat password</label>
                                <input type="password" class="input-medium" />
                            </p>
                            <fieldset>
                                <input class="submit-green" type="submit" value="Submit" /> 
                                <input class="submit-gray" type="submit" value="Cancel" />
                            </fieldset>
                        </form>
                        
                     </div> <!-- End .module-body -->
                </div> <!-- End .module -->
                <div style="clear:both;"></div>
            </div> <!-- End .grid_6 -->
            <div style="clear:both;"></div>
        </div> <!-- End .container_12 -->
<%@ include file="includes/footer.jsp" %> 