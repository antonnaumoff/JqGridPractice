<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<tiles:insertDefinition name="defaultTemplate">
  <tiles:putAttribute name="body">



    <div class="container">
      <div class="row">
        <div class="col-sm-2"></div>
        <div class="col-sm-8">
          <div id="id" style="display: none">${id}</div>

          <table id="emp"></table>
          <div id="empPager"></div>
        </div>
        <div class="col-sm-2"></div>
      </div>
    </div>



  </tiles:putAttribute>
</tiles:insertDefinition>