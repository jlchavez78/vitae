import { VitaeAppPage } from './app.po';

describe('vitae-app App', () => {
  let page: VitaeAppPage;

  beforeEach(() => {
    page = new VitaeAppPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
