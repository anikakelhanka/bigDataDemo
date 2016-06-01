'use strict';

var rsBaseApp = angular.module(
		'rsBaseApp',
		[ 'ngResource', 'ui.grid', 'ui.grid.resizeColumns',
				'ui.grid.autoResize', 'ui.grid.pagination', 'ui.grid.edit',
				'ui.grid.rowEdit', 'ui.grid.selection', 'ui.grid.cellNav' ])
		.controller('rsBaseMainCtrl', [ '$scope', function($scope) {
		} ]);