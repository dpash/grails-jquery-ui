=======================
Grails jQuery Ui plugin
=======================
This plugin contains the jquery-ui 1.6rc5 javascript, css, and image files.
It also contains a simple grails taglib which is documented below.

To use this plugin, the ``jquery`` plugin is also needed. I have not declared
a dependency, because the current version number of that plugin (1.0RC1)
can't be parsed, aborting the install of my plugin.

Usage
*****
First build this plugin::

  git clone git://github.com/bartschuller/grails-jquery-ui.git
  cd grails-jquery-ui
  grails package-plugin

Then install it into your grails project::

  cd ~/myproject
  grails install-plugin jquery
  grails install-plugin ~/grails-jquery-ui/grails-jquery-ui-0.1.zip

Tags
++++

``<jqui:resources/>``
=====================
To be used inside ``<head>``, it loads the appropriate JavaScript and
CSS files. It is an empty element, which recognizes the following attributes:

components
----------
comma separated list of ui components to include. Possible values:
*accordion, datepicker, dialog, draggable, droppable, progressbar, resizable,
selectable, slider, sortable, tabs*

effects
-------
comma separated list of effects to include. Possible values:
*blind, bounce, clip, drop, explode, fold, highlight, pulsate, scale, shake,
slide, transfer*

mode
----
javascript packing to use. Can be *min* (default),
*packed* or *normal*

theme
-----
css theme to use, defaults to *base*

``<jqui:datepicker/>``
======================
To be used inside ``<jq:jquery>``, it attaches a datepicker widget to
the elements selected by the selector. It currently knows the following
attributes:

selector
--------
The jquery `selector <http://docs.jquery.com/Selectors>`_

dateformat
----------
The `date format <http://docs.jquery.com/UI/Datepicker/%24.datepicker.formatDate>`_
to use, which defaults to *m/d/y* because that is the only format which grails
can successfully convert from a String to a Date.
**note** The jquery-ui date format differs from the Java SimpleDateFormat.

Roll your own
=============
The datepicker shows how easy it is. You can either add more attributes
to it and use it as a template for other widgets, or use raw jquery-ui
JavaScript.

The file to edit is ``grails-app/taglib/JqueryUiTagLib.groovy``

Themes
******
The following themes are included:

**base**

The default theme, white background with blackish widgets

**Cupertino**

As downloaded from the gallery at http://ui.jquery.com/themeroller

You can add new themes by using the themeroller, renaming the downloaded
directory and placing it in ``web-app/themes/`` in this plugin (or in
the installed plugin directory inside your project)

Example
*******
::

  <html>
    <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
      <meta name="layout" content="main" />
      <title>Grails jQuery UI test</title>
      <g:javascript library="jquery"/>
      <jqui:resources components="datepicker" mode="normal" theme="Cupertino"/>
      <jq:jquery>
        <jqui:datepicker selector="#myDate"/>
      </jq:jquery>
    </head>
    <body>
      <g:form>
        <input id="myDate" name="myDate" type="text" />
      </g:form>
    </body>
  </html>

Author
******
The grails plugin was written by Bart Schuller <Bart.Schuller@gmail.com>
See AUTHORS.txt for the jQuery UI authors.
