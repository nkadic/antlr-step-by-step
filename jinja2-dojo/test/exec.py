import os
from jinja2 import Environment, FileSystemLoader
import xml.dom.minidom


# Capture our current directory
THIS_DIR = os.path.dirname(os.path.abspath(__file__))

def hw(names):
    names_str=','.join(names)
    return names_str
def upperNames(names):
    return [i.upper() for i in names]


def print_html_doc():
    # Create the jinja2 environment.
    # Notice the use of trim_blocks, which greatly helps control whitespace.
    j2_env = Environment(loader=FileSystemLoader(THIS_DIR),
                         trim_blocks=True)
    j2_env.globals['hw'] = hw
    j2_env.globals['upperNames'] = upperNames

    text = j2_env.get_template('test_template.html').render(title='Hellow Gist from GutHub', names=['Nebojsa','Alex','Emma'])
    print(text)

def translate (names) :
    print ('')


if __name__ == '__main__':
    print_html_doc()

    xml_str='<list name="l2.f1"><keys><key name="l2.f2"></key><key name="l3.f3"></key></keys><leaf name="l2.f2"></leaf><leaf name="l3.f3"></leaf><leaf-list name="l2.f2"></leaf-list><container name="l3.f1"><leaf name="l4.f1"></leaf><leaf-list name="l2.f2"></leaf-list></container></list>'
    dom = xml.dom.minidom.parseString(xml_str) # or xml.dom.minidom.parseString(xml_string)
    pretty_xml_as_string = dom.toprettyxml()
    print(pretty_xml_as_string)