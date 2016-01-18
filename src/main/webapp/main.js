$(document).ready(function (e) {
    jQuery('#dep').jqGrid({
        url: 'rest/departments',
        datatype: 'json',
        mtype: 'POST',
        colNames: ['Inv No', 'Title', 'Emp'],
        colModel: [
            {name: 'id', index: 'id', width: 60, sortable: true, align: 'center'},
            {name: 'title', index: 'title', sortable: true, editable: true, width: 780},
            {name: 'id', editable: false, formatter: empLinkFormatter, align: 'center', width: 60}
        ],

        pager: '#depPager',
        sortname: 'title',
        viewrecords: true,
        height: 'auto',
        pgbuttons:  true,
        caption: 'JQDepartments',
        pginput: false,
        rowList: [10, 20, 30],
        sortable: true,
        add: true,

        userData: ['hello'],
        userDataOnFooter: true
    });

    jQuery('#emp').jqGrid({
        url: getEmpUrl(),
        datatype: 'json',
        mtype: 'POST',
        colNames: ['Job Title', 'First Name', 'Second Name', 'Salary', 'Date', 'Dep'],
        colModel: [

            {name: 'job_title', index: 'job_title'},
            {name: 'first_name', index: 'first_name'},
            {name: 'second_name', index: 'second_name'},
            {name: 'salary', index: 'salary'},
            {name: 'date', index: 'date'},
            {name: 'date', formatter: depLinkFormatter}

        ],

        pager: '#empPager',
        sortname: 'title',
        viewrecords: true,
        height: 'auto',

        caption: 'JQDepartments',
        pginput: false,
        rowList: [10, 20, 30],
        sortable: true,

        userData: ['hello'],

        userDataOnFooter: true
    });

    function empLinkFormatter(cellValue, options, rowObject){
        return '<a href=employees/' + cellValue + "><span class=\"glyphicon glyphicon-th-list\"></span></a>";
    }
    function depLinkFormatter(cellValue, options, rowObject){
        return '<a href=\"/\"><span class=\"glyphicon glyphicon-th-list\"></span></a>';
    }

    function getEmpUrl(){
        var url = 'rest/employees/';
        var id = $('#id').text();
        return 'http://localhost:8082/'+url+id;
    }

});