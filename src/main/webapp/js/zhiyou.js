/**
 * 日期控件样式
 */
$(".form-date").datetimepicker({
	format: 'yyyy-mm-dd', //显示格式
	minView: 'month',
	autoclose: true, //当选择一个日期之后是否立即关闭此日期时间选择器
	language: 'zh-CN',
	clearBtn: true //清除按钮
});

/**
 * 日期控件样式 
 */
$(".form-datetime").datetimepicker({
	format: 'yyyy-mm-dd hh:ii:00', //显示格式
	minView: 'hour',
	autoclose: true, //当选择一个日期之后是否立即关闭此日期时间选择器
	language: 'zh-CN',
	clearBtn: true //清除按钮
});