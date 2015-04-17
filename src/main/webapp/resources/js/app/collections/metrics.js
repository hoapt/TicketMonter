/**định nghĩa một bộ sưu tập Backbone để xử lý các bộ sưu tập số liệu
 * The module for a collection of Metrics
 */
define([
    'app/models/metric',
    'configuration',
    'backbone'
], function (Metric, config) {

    // Here we define the Metrics collection
    // We will use it for CRUD operations on Metrics

    var Metrics = Backbone.Collection.extend({
        url: config.baseUrl + 'rest/metrics',
        model: Metric
    });

    return Metrics;
});