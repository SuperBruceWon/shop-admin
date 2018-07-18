<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:layout title="添加手机">
  <form:form action="" method="post" commandName="cellphone">
    <div>
      <label for="brand">品牌</label>
      <form:select path="brand">
        <form:option value="">--请选择品牌--</form:option>
        <form:option value="苹果">苹果</form:option>
        <form:option value="锤子">锤子</form:option>
        <form:option value="华为">华为</form:option>
      </form:select>
      <form:errors path="brand" />
    </div>
    
    <div>
      <label for="model">型号</label>
      <form:input path="model"/>
    </div>
    
    <div>
      <label for="os">操作系统</label>
      <form:select path="os">
        <form:option value="">--请选择操作系统--</form:option>
        <form:option value="Android">Android</form:option>
        <form:option value="IOS">IOS</form:option>
        <form:option value="Windows Phone">Windows Phone</form:option>
      </form:select>      
    </div>
    
    <div>
      <label for="cpuBrand">CPU品牌</label>
      <form:select path="cpuBrand">
        <form:option value="">--请选择CPU品牌--</form:option>
        <form:option value="高通">高通</form:option>
        <form:option value="联发科">联发科</form:option>
      </form:select>
    </div>    
    
    <div>
      <label for=cpuCoreCount>CPU核心数</label>
      <form:input path="cpuCoreCount" type="number" min="1" max="16" />
    </div>
    
    <div>
      <label for=ram>运行内存</label>
      <form:input path="ram" type="number" min="1" max="16" placeholder="GB" />
    </div>
    
    <div>
      <label for=storage>机身存储</label>
      <form:input path="storage" type="number" min="16" max="256" placeholder="GB" />
    </div>    
    
    <div>
      <label for="color">颜色</label>
      <form:input path="color"/>
    </div>
    
    <div>
      <label for="description">描述</label>
      <form:textarea path="description"/>
    </div> 
    
    <div>
      <label for=price>价格</label>
      <form:input path="price" type="number" min="1" max="10000" placeholder="分" />
    </div> 
    
    <div>
      <button type="submit">保存</button>
    </div>
  </form:form>
</t:layout>
