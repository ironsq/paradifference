import { Angular2WebPage } from './app.po';

describe('angular2-web App', function() {
  let page: Angular2WebPage;

  beforeEach(() => {
    page = new Angular2WebPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
