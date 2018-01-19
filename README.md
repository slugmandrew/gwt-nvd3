# GWT-NVD3: Wrapper library for using NVD3 in GWT

This is a simple JsInterop-based wrapper for NVD3 and a few relevant D3 calls as well, allowing for easy
charting in a GWT application. The API here does not reflect all of the possible methods and options in 
NVD3, just the ones we've needed to work with so far - patches and issues welcome to continue to round 
out the tool.

This library does not automatically include D3 or NVD3 in your project, so as to not pick the specific 
version and method of loading the library that you would like to use. One possible option is explored in
the sample project, using the webjars project for NVD3 and loading the requires scripts and styles in
the HTML file.

Built by Vertispan, sponsored and managed by Utilities Savings Limited.